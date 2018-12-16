CREATE TABLE [dbo].[Bitacora] (
    Id int IDENTITY(1,1) PRIMARY KEY,
    Nombre_Tabla varchar(255),
    Instruccion varchar(max),
    Replicada BIT DEFAULT 0
)
GO