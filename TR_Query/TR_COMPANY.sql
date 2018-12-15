CREATE TRIGGER [dbo].[TR_AI_COMPANY] 
ON [dbo].[Company] AFTER INSERT
AS
BEGIN
	declare @comid int;
	declare @comname varchar(100);
	declare @cbitacora varchar(255);
	SELECT @comid=i.ID_comp FROM inserted i;
	SELECT @comname=i.name FROM inserted i;
	SET @cbitacora = CONCAT('insert into Company (ID_comp, name) values(' , @comid ,',''',@comname ,''');');
 	INSERT INTO [dbo].[Bitacora](Nombre_Tabla, Instruccion)
    VALUES ('Company', @cbitacora);
END
GO

CREATE TRIGGER [dbo].[TR_AU_COMPANY] 
ON [dbo].[Company] AFTER UPDATE
AS
BEGIN
	declare @comid int;
	declare @comname varchar(100);
	declare @cbitacora varchar(255);
	SET @comid = -1;
	SELECT @comid=i.ID_comp FROM inserted i;
	SELECT @comname=i.name FROM inserted i;
	IF @comid != -1
	BEGIN
		SET @cbitacora = CONCAT('update Company set name =''',@comname,''' where ID_comp =',@comid,';');
 		INSERT INTO [dbo].[Bitacora](Nombre_Tabla, Instruccion)
		VALUES ('Company', @cbitacora);
	END ELSE
		PRINT 'No se modifico'
END
GO

CREATE TRIGGER [dbo].[TR_AD_COMPANY] 
ON [dbo].[Company] AFTER DELETE
AS
BEGIN
	declare @comid int;
	declare @cbitacora varchar(255);
	SET @comid = -1;
	SELECT @comid=d.ID_comp FROM deleted d;
	IF @comid != -1
	BEGIN
		SET @cbitacora = CONCAT('delete from Company where ID_comp =',@comid,';');
 		INSERT INTO [dbo].[Bitacora](Nombre_Tabla, Instruccion)
		VALUES ('Company', @cbitacora);
	END ELSE
		PRINT 'No se elimino'
END
GO
