<?php
require "conn.php";
$full_name = $_POST["full_name"];
$email = $_POST["email"];
$phone_number = $_POST["phone_number"];
$work_detail = $_POST["work_detail"];
$work_nextMonth = $_POST["work_nextMonth"];
$work_asap = $_POST["work_asap"];
$yardwork = $_POST["yardwork"];
$cleaning = $_POST["cleaning"];
$hauling = $_POST["hauling"];
$painting = $_POST["painting"];
$landscaping = $_POST["landscaping"];
$cementing = $_POST["cementing"];
$construction = $_POST["construction"];
$other = $_POST["other"];

$mysql_qry = "INSERT INTO hireforms(fullName, email, phone_number, work_detail, work_nextMonth, work_asap,
					yardwork, cleaning, hauling, painting, landscaping, cementing, construction, other)
				VALUES('$full_name', '$email', '$phone_number', '$work_detail', '$work_nextMonth', '$work_asap',
				'$yardwork', '$cleaning','$hauling','$painting','$landscaping','$cementing',
				'$construction','$other')";
				
if($conn->query($mysql_qry) === TRUE){
	echo "Hire form request success!";
}
else{
	echo "Hire form request failed!";
}

$conn->close();
?>