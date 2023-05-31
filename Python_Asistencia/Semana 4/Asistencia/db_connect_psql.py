import psycopg2

SELECT * FROM public."Persona"
ORDER BY id_persona ASC 

--SELECT * FROM "Persona" WHERE id_persona in (1,2,3) 
--INSERT INTO "Persona" (name, lastname, mail) VALUES ("Natan", "UTN", "natan@utn.com") 
--SELECT * FROM "Persona"

#creamos un objeto de la clase psycopg2.extensions.connection
#connect_object
connect_object = psycopg2.connect(
    database = 'bbdd_tst',
    user = 'postgres',
    password = 'Admin',
    host = '127.0.0.1',
    port = '5433'
)

#creamos un objeto de la clase psycopg2.extensions.cursor
#cursor
cursor = connect_object.cursor()
snt = 'SELECT * FROM Persona'
cursor.execute(snt)
reg = cursor.fetchall()

print(reg)
