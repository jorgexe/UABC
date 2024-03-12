<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Título de la Página</title> <!-- Aquí cambia el título -->
</head>
<body>
    <p><strong>Matricula: </strong> 1288599</p>
    <p><strong>Nombre completo: </strong> Jorge Alejandro Sandoval Romo</p>
    <?php
    //conexion a base de datos;
    $servername = "localhost";
    $username = "jorge";
    $password = "Jorge1234";
    $dbname = "sakila";

    //nos conectamos y mandamos las varibales del usuario ;
    $conn = new mysqli ($servername,$username,$password,$dbname);

    //se valida si la conexion tuvo un error
    if ($conn->connect_error) {
        die("Conexion fallida: " . $conn->connect_error);
    } 
    //cierra la conexion
    echo "Conexion exitosa a la Base de Datos: ".$dbname;


    //cierra la conexion
    $conn->close();
    ?>
</body>
</html>