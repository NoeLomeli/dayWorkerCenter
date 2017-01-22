<?php
$db_name = "dayworker";
$mysql_username = "root";
$mysql_password = "";
$mysql_server_name = "localhost";
$conn = mysqli_connect($mysql_server_name, $mysql_username, $mysql_password, $db_name);
if($conn){
	echo "Connection Success!" . "<br>";
}
else{
	echo "Connection not successful";
}
?>