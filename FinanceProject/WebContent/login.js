
function checkUserExistOrNot(id){

    document.getElementById(id).disabled = true;
    let panCardValue = document.getElementById(id).value;
    if ( validatePAN(panCardValue) === false ){
        document.getElementById(id).value = '';
    }else{
        postRequest( "http://localhost:8080/FinanceProject/financeapi/verifyUser", convertToPanJson(panCardValue), (err,data)=>{
            if( err){
                console.log(err);
            }else{
                console.log("value = " +  data);
            }
        });
    }
}


function validatePAN(pan_value) {
    let regex = /([A-Z]){5}([0-9]){4}([A-Z])$/;
    if (regex.test(pan_value.toUpperCase())) {
        return true;
    } else {
        alert("Invalid PAN Card");
        return false;
    }
}
