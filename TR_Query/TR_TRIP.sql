CREATE TRIGGER [dbo].[TR_AI_TRIP] 
ON [dbo].[Trip] AFTER INSERT
AS
BEGIN
	declare @ttrip_no int;
	declare @tID_comp int;
	declare @tplane varchar(10);
	declare @ttown_from varchar(25);
	declare @ttown_to varchar(25);
	declare @ttime_out time;
	declare @ttime_in time;
	declare @pasbitacora varchar(255);
	SELECT @ttrip_no=i.trip_no FROM inserted i;
	SELECT @tID_comp=i.ID_comp FROM inserted i;
	SELECT @tplane=i.plane FROM inserted i;
	SELECT @ttown_from=i.town_from FROM inserted i;
	SELECT @ttown_to=i.town_to FROM inserted i;
	SELECT @ttime_out=i.time_out FROM inserted i;
	SELECT @ttime_in=i.time_in FROM inserted i;
	SET @pasbitacora = CONCAT('insert into Trip (trip_no , ID_comp, plane, town_from, town_to, time_out, time_in) values(', @ttrip_no ,',',@tID_comp,',''',@tplane,''',''',@ttown_from,''',''' ,@ttown_to,''',''',@ttime_out,''',''',@ttime_in,''');');
 	INSERT INTO [dbo].[Bitacora](Nombre_Tabla, Instruccion)
    VALUES ('Trip', @pasbitacora);
END
GO

CREATE TRIGGER [dbo].[TR_AU_TRIP] 
ON [dbo].[Trip] AFTER UPDATE
AS
BEGIN
	declare @ttrip_no int;
	declare @tID_comp int;
	declare @tplane varchar(10);
	declare @ttown_from varchar(25);
	declare @ttown_to varchar(25);
	declare @ttime_out time;
	declare @ttime_in time;
	declare @pasbitacora varchar(255);
	SET @ttrip_no = -1;
	SELECT @ttrip_no=i.trip_no FROM inserted i;
	SELECT @tID_comp=i.ID_comp FROM inserted i;
	SELECT @tplane=i.plane FROM inserted i;
	SELECT @ttown_from=i.town_from FROM inserted i;
	SELECT @ttown_to=i.town_to FROM inserted i;
	SELECT @ttime_out=i.time_out FROM inserted i;
	SELECT @ttime_in=i.time_in FROM inserted i;
	IF @ttrip_no != -1
	BEGIN
		SET @pasbitacora = CONCAT('update Trip set ID_comp =', @tID_comp ,', plane =''',@tplane,''', town_from =''',@ttown_from,''', town_to =''',@ttown_to,''', time_out =''',@ttime_out,''', time_in =''',@ttime_in,''' where trip_no =',@ttrip_no,';');
	 	INSERT INTO [dbo].[Bitacora](Nombre_Tabla, Instruccion)
	    VALUES ('Trip', @pasbitacora);
	END ELSE
		PRINT 'No se modifico'
END
GO

CREATE TRIGGER [dbo].[TR_AD_TRIP] 
ON [dbo].[Trip] AFTER DELETE
AS
BEGIN
	declare @ttrip_no int;
	declare @cbitacora varchar(255);
	SET @ttrip_no = -1;
	SELECT @ttrip_no=d.trip_no FROM deleted d;
	IF @ttrip_no != -1
	BEGIN
		SET @cbitacora = CONCAT('delete from Trip where trip_no =',@ttrip_no,';');
	 	INSERT INTO [dbo].[Bitacora](Nombre_Tabla, Instruccion)
	    VALUES ('Trip', @cbitacora);
	END ELSE
		PRINT 'No se elimino'
END
GO