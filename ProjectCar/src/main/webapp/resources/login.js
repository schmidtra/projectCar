window.onload = function(){
	document.getElementById("logout").style.visibility = "hidden"; 
	document.getElementById("nrequest").style.visibility = "hidden"; 
	document.getElementById("loginBtn").addEventListener("click", loginRequest, false);	
	document.getElementById("logout").addEventListener("click", logout, false);	
}

function approvalTableGen(test){
	var appTable = document.createElement("TABLE");
	appTable.border=2;
	var i;
	for(i=0; i<test.length; i++){
		var tr = document.createElement("TR");
		var appID = document.createElement("TD");
		appID.innerHTML = test[i];
		
		var appEmployeeID = document.createElement("TD");
		appEmployeeID.innerHTML = "EmployeeID";
		
		var appType = document.createElement("TD");
		appType.innerHTML = "Type";
		
		var appDesc = document.createElement("TD");
		appDesc.innerHTML = "Description goes here";
		
		var appJust = document.createElement("TD");
		appJust.innerHTML = "Justification goes here";
		
		var appLocationN = document.createElement("TD");
		appLocationN.innerHTML = "Location Name";
		
		var appLocationS = document.createElement("TD");
		appLocationS.innerHTML = "Location Street";
		
		var appLocationC = document.createElement("TD");
		appLocationC.innerHTML = "Location City";
		
		var appLocationSt = document.createElement("TD");
		appLocationSt.innerHTML = "Location State";
		
		var appLocationZ = document.createElement("TD");
		appLocationZ.innerHTML = "Location Zip";
		
		var appCost = document.createElement("TD");
		appCost.innerHTML = "Tuition Cost";
		
		var appDate = document.createElement("TD");
		appDate.innerHTML = "D A T E";
		
		var appStart = document.createElement("TD");
		appStart.innerHTML = "Start Date";
		
		var appEnd = document.createElement("TD");
		appEnd.innerHTML = "End Date";
		
		var appHours = document.createElement("TD");
		appHours.innerHTML = "Hours Spent";
		
		var appStatus = document.createElement("TD");
		appStatus.innerHTML = "Status";
		
		var appBenco = document.createElement("TD");
		appBenco.innerHTML = "Benco ID";
		
		
		var butApp = document.createElement("BUTTON");
		butApp.id = i;
		butApp.innerHTML = "Approve";
		butApp.onclick = function(){alert("Approved")};
		
		var butDen = document.createElement("BUTTON");
		butDen.id = i;
		butDen.innerHTML = "Deny";
		butDen.onclick = function(){alert("Denied")};
		
		
		tr.appendChild(appID);
		tr.appendChild(appEmployeeID);
		tr.appendChild(appType);
		tr.appendChild(appDesc);
		tr.appendChild(appJust);
		tr.appendChild(appLocationN);
		tr.appendChild(appLocationS);
		tr.appendChild(appLocationC);
		tr.appendChild(appLocationSt);
		tr.appendChild(appLocationZ);
		tr.appendChild(appCost);
		tr.appendChild(appDate);
		tr.appendChild(appStart);
		tr.appendChild(appEnd);
		tr.appendChild(appHours);
		tr.appendChild(appStatus);
		tr.appendChild(appBenco);
		tr.appendChild(butApp);
		tr.appendChild(butDen);
		
		appTable.appendChild(tr);
	}
	document.getElementById("approvals").appendChild(appTable);
	
}

function requestTableGen(test){
	
	var reqTable = document.createElement("TABLE");
	reqTable.border=2;
	var i;
	for(i=0; i<test.length; i++){
		var tr = document.createElement("TR");
		var reqID = document.createElement("TD");
		reqID.innerHTML = test[i];
		var reqType = document.createElement("TD");
		reqType.innerHTML = "Request Type";
		var reqDesc = document.createElement("TD");
		reqDesc.innerHTML = "Request Description"
		var reqStatus = document.createElement("TD");
		reqStatus.innerHTML = "Request Status"
		var but = document.createElement("BUTTON");
		but.id = i;
		but.innerHTML = "Send File";
		but.onclick = function(){alert(this.id)};
		tr.appendChild(reqID);
		tr.appendChild(reqType);
		tr.appendChild(reqDesc);
		tr.appendChild(reqStatus);
		tr.appendChild(but);
		reqTable.appendChild(tr);
	}
	document.getElementById("requests").appendChild(reqTable);
}
	function loginRequest(){
		
		var xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function(){
			if (xhr.readyState == 4 && xhr.status == 200){
				var person = JSON.parse(xhr.responseText);
				populate(person);
				document.getElementById("login").style.visibility = "hidden"; 
				document.getElementById("logout").style.visibility = "visible"; 
				document.getElementById("nrequest").style.visibility = "visible"; 
			}
			
		}
		document.getElementById("login").style.visibility = "hidden"; 
		document.getElementById("logout").style.visibility = "visible"; 
		document.getElementById("nrequest").style.visibility = "visible"; 
		var test = ["a","b","c","d","e","f","g"];
		requestTableGen(test);
		approvalTableGen(test);
		xhr.open("POST", "/login", true);
		xhr.send(JSON.stringify({username:document.getElementById("uname").value, password:document.getElementById("pwd").value}));

	}
	
	function logout(){
		document.getElementById("login").style.visibility = "visible"; 
		document.getElementById("logout").style.visibility = "hidden"; 
		document.getElementById("nrequest").style.visibility = "hidden"; 
	}

	function setCookie(person){
		document.cookie = "employeeid="+ person.id;
	}
	
	
