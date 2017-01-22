<?php
require "conn.php"; #Requires a connection
$first_name = $_POST["first_name"];
$last_name = $_POST["last_name"];
$user_name = $_POST["username"];
$user_pass = $_POST["password"];

$mysql_qry = "insert into profiles(first_name, last_name, username, password)
			  VALUES('$first_name', '$last_name', '$user_name', '$user_pass')";

if($conn->query($mysql_qry) === TRUE){
	echo "Insert Success!";
}
else{
	echo "Insert failed: " . $mysql_qry . "<br>" . $conn->error;
}

$conn->close();
?>