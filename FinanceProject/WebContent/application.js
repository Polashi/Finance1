function findUserInformation(id){
	let information = document.getElementById("displayInformation");
	document.getElementById(id).disabled = true;
	let applicationId = document.getElementById(id).value;
	postRequest("http://localhost:8080/FinanceProject/financeapi/applicationId", convertToApplicationJson(applicationId), (error,result)=>{
		if( error ){
			information.innerText = "Application Id doest Not exist" 
		}else {
			information.innerText = "User Info" 
		}
	});	
}

function getMoreInformation(){
	let information = document.getElementById("displayFurtherMoreInfo");
	let applicationId = document.getElementById(id).value;
	
}