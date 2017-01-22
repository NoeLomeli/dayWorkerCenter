<?php
require "conn.php"; #Requires a connection
$user_name = $_POST["username"];
$user_pass = $_POST["password"];

$mysql_qry = "select * from profiles 
	where username like '$user_name'
	and password like '$user_pass'";
$result = mysqli_query($conn, $mysql_qry);
if(mysqli_num_rows($result)){
	echo "Login Success!";
}
else{
	echo "Login failed" . "<br>";
}
?>