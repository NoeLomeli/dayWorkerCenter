<?php
require "conn.php"; #Requires a connection
$first_name = $_POST["first_name"];
$last_name = $_POST["last_name"];
$user_name = $_POST["username"];
$user_pass = $_POST["password"];
$user_tools = $_POST["tools"];
$user_skills = $_POST["skills"];
$user_location = $_POST["location"];
$user_transportation = $_POST["transportation"];
$user_join_date = $_POST["join_date"];

$mysql_qry = "insert into profiles(first_name, last_name, username, password, tools, skills, location, transportation, dateJoined)
			  VALUES('$first_name', '$last_name', '$user_name', '$user_pass', '$user_tools', '$user_skills', '$user_location', '$user_transportation', '$user_join_date')";

if($conn->query($mysql_qry) === TRUE){
	echo "Insert Success!";
}
else{
	echo "Insert failed: " . $mysql_qry . "<br>" . $conn->error;
}

$conn->close();
?>