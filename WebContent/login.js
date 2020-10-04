 function checkUserExistOrNot(){
    let panCardValue = document.getElementById("panCard").value;
    if ( validatePAN(panCardValue) === false ){
    	document.getElementById("panCard").value = '';
    }else{
	    console.log(panCardValue);
	    postRequest(panCardValue);
    }
}

function postRequest(value){
    console.log(value)
    let data = {"value":value}
    let xml = getXMLHTTPObject();
    xml.onreadystatechange = () => {
        if( xml.readyState === XMLHttpRequest.DONE ){
        	if( xml.status == 200 ){
        		return true;
        	}
        	else{
        		return false;
        	}
            console.log(xml.responseText);
        }
    }

    xml.open("POST", "http://localhost:8080/FinanceProject/financeapi/verifyUser",true);
    xml.setRequestHeader("Content-Type","application/json");
    xml.send(JSON.stringify(data));
}


function validatePAN(panCardValue) {
	console.log(panCardValue);
    let regex = /([A-Z]){5}([0-9]){4}([A-Z])$/;
    if (regex.test(panCardValue.toUpperCase())) {
        return true;
    } else {
    	alert("Invalid PAN Card");
        return false;
    }
}



function getXMLHTTPObject(){
    return new XMLHttpRequest();
}