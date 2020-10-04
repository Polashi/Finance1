function checkAccountNumberValidOrNot(){
    let accountNumber = document.getElementById("accountNumber").value;
    if ( validateAccountNumber(accountNumber) === false ){
    	document.getElementById("accountNumber").value = '';
    }else{
	    console.log(accountNumber);
    }
}
function validateAccountNumber(accountNumber) {
	console.log(accountNumber);
    let regex = /^\d{9,18}$/;
    if (regex.test(accountNumber)) {
        return true;
    } else {
    	alert("Invalid AccountNumber");
        return false;
    }
}
function checkIFSCCodeValidOrNot(){
    let ifscCode = document.getElementById("").value;
    if ( validateIFSCCode(ifscCode) === false ){
    	document.getElementById().value = '';
    }else{
	    console.log(ifscCode);
    }
}
function validateIFSCCode(ifscCode) {
	console.log(ifscCode);
    let regex = /^[A-Z]{4}0[A-Z0-9]{6}$/;
    if (regex.test(ifscCode)) {
        return true;
    } else {
    	alert("Invalid AccountNumber");
        return false;
    }
}
