CREATE TRIGGER [dbo].[TR_AI_PASS_IN_TRIP] 
ON [dbo].[Pass_in_trip] AFTER INSERT
AS
BEGIN
	declare @passtrip_no int;
	declare @pasdate date;
	declare @pasID_psg int;
	declare @pasplace varchar(100)
	declare @pasbitacora varchar(255);

	SELECT @passtrip_no=i.trip_no FROM inserted i;
	SELECT @pasdate=i.date FROM inserted i;
	SELECT @pasID_psg=i.ID_psg FROM inserted i;
	SELECT @pasplace=i.place FROM inserted i;

	SET @pasbitacora = CONCAT('insert into Pass_in_trip (trip_no , date, ID_psg, place) values(', @passtrip_no ,',''',@pasdate,''',',@pasID_psg,',''',@pasplace ,''');');
 	INSERT INTO [dbo].[Bitacora](Nombre_Tabla, Instruccion)
    VALUES ('Pass_in_trip', @pasbitacora);
END
GO

CREATE TRIGGER [dbo].[TR_AU_PASS_IN_TRIP] 
ON [dbo].[Pass_in_trip] AFTER UPDATE
AS
BEGIN
	declare @passtrip_no int;
	declare @pasdate date;
	declare @pasID_psg int;
	declare @pasplace varchar(100)
	declare @pasbitacora varchar(255);
	SET @passtrip_no = -1;

	SELECT @passtrip_no=i.trip_no FROM inserted i;
	SELECT @pasdate=i.date FROM inserted i;
	SELECT @pasID_psg=i.ID_psg FROM inserted i;
	SELECT @pasplace=i.place FROM inserted i;
	IF @passtrip_no != -1
	BEGIN
		SET @pasbitacora = CONCAT('update Pass_in_trip set date =''', @pasdate ,''', ID_psg =',@pasID_psg,', place =''',@pasplace,''' where trip_no =',@passtrip_no,';');
	 	INSERT INTO [dbo].[Bitacora](Nombre_Tabla, Instruccion)
	    VALUES ('Pass_in_trip', @pasbitacora);
	END ELSE
		PRINT 'No se modifico'
END
GO

CREATE TRIGGER [dbo].[TR_AD_PASS_IN_TRIP] 
ON [dbo].[Pass_in_trip] AFTER DELETE
AS
BEGIN
	declare @passtrip_no int;
	declare @cbitacora varchar(255);
	SET @passtrip_no = -1;
	SELECT @passtrip_no=d.trip_no FROM deleted d;
	IF @passtrip_no != -1
	BEGIN
		SET @cbitacora = CONCAT('delete from Pass_in_trip where trip_no =',@passtrip_no,';');
	 	INSERT INTO [dbo].[Bitacora](Nombre_Tabla, Instruccion)
	    VALUES ('Pass_in_trip', @cbitacora);
	END ELSE
		PRINT 'No se elimino'
END
GO