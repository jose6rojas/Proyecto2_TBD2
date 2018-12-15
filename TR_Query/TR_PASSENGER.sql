CREATE TRIGGER [dbo].[TR_AI_PASSENGER] 
ON [dbo].[Passenger] AFTER INSERT
AS
BEGIN
	declare @comid int;
	declare @comname varchar(100);
	declare @cbitacora varchar(255);
	SELECT @comid=i.ID_psg FROM inserted i;
	SELECT @comname=i.name FROM inserted i;
	SET @cbitacora = CONCAT('insert into Passenger (ID_psg, name) values(' , @comid ,',''',@comname ,''');');
 	INSERT INTO [dbo].[Bitacora](Nombre_Tabla, Instruccion)
    VALUES ('Passenger', @cbitacora);
END
GO

CREATE TRIGGER [dbo].[TR_AU_PASSENGER] 
ON [dbo].[Passenger] AFTER UPDATE
AS
BEGIN
	declare @comid int;
	declare @comname varchar(100);
	declare @cbitacora varchar(255);
	SET @comid = -1;
	SELECT @comid=i.ID_psg FROM inserted i;
	SELECT @comname=i.name FROM inserted i;
	IF @comid != -1
	BEGIN
		SET @cbitacora = CONCAT('update Passenger set name =''',@comname,''' where ID_psg =',@comid,';');
 		INSERT INTO [dbo].[Bitacora](Nombre_Tabla, Instruccion)
		VALUES ('Passenger', @cbitacora);
	END ELSE
		PRINT 'No se actualizo'
END
GO

CREATE TRIGGER [dbo].[TR_AD_PASSENGER] 
ON [dbo].[Passenger] AFTER DELETE
AS
BEGIN
	declare @comid int;
	declare @cbitacora varchar(255);
	SET @comid = -1;
	SELECT @comid=d.ID_psg FROM deleted d;
	IF @comid != -1
	BEGIN
		SET @cbitacora = CONCAT('delete from Passenger where ID_psg =',@comid,';');
 		INSERT INTO [dbo].[Bitacora](Nombre_Tabla, Instruccion)
		VALUES ('Passenger', @cbitacora);
	END ELSE
		PRINT 'No se elimino'
END
GO
