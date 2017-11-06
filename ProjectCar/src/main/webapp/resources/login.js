window.onload = function() {
	document.getElementById("logout").style.visibility = "hidden";
	document.getElementById("nrequest").style.visibility = "hidden";
	document.getElementById("loginBtn").addEventListener("click", loginRequest,
			false);
	document.getElementById("logout").addEventListener("click", logout, false);
}
var empReq = [
	{id:5, type:"Certification Training", description:"Internet Essentials", status:"Awaiting Grade"}
	
];
var supervisorApp = [
	{id:1, empId:13, type:"Certification",description:"Astrology", justification:"Expanding my skill set", lName:"Lawson Tec Training Center", lStreet:"441 Calisle Dr", lCity:"Herndon", lState:"Virginia", lZip:"20190", cost:"$400",aDate:"11/5/2017", sDate:"12/15/2017", eDate:"12/15/2017", hours:"5", status:"Pending", bCo:"14"},
	{id:2, empId:15, type:"University",description:"IT Management", justification:"Will learn IT learning material not provided by company", lName:"Georgia Southern University", lStreet:"1332 Southern Drive", lCity:"Statesboro", lState:"Georgia", lZip:"30458", cost:"$800",aDate:"12/14/2011", sDate:"1/14/2018", eDate:"5/5/2018", hours:"11 per week", status:"Pending", bCo:"12"}
];
function approvalTableGen(reqItems) {
	var appTable = document.createElement("TABLE");
	appTable.id ="app";
	appTable.border = 1;
	var trLabel1 = document.createElement("TR");
	trLabel1.style.backgroundColor = "rgba(180,180,180,0.75)";
	var tdLabelID = document.createElement("TD");
	tdLabelID.innerHTML = "<b> ID </b>";
	var tdLabelEmpID = document.createElement("TD");
	tdLabelEmpID.innerHTML = "<b> Employee ID </b>";
	var tdLabelType = document.createElement("TD");
	tdLabelType.innerHTML = "<b> Request Type </b>"
	var tdLabelDesc = document.createElement("TD");
	tdLabelDesc.innerHTML = "<b> Description </b>";
	var tdLabelJust = document.createElement("TD");
	tdLabelJust.innerHTML = "<b> Justification </b>";
	var tdLabelLN = document.createElement("TD");
	tdLabelLN.innerHTML = "<b> Location Name </b>";
	var tdLabelLS = document.createElement("TD");
	tdLabelLS.innerHTML = "<b> Street </b>";
	var tdLabelLC = document.createElement("TD");
	tdLabelLC.innerHTML = "<b> City </b>";
	var tdLabelLSt = document.createElement("TD");
	tdLabelLSt.innerHTML = "<b> State </b>";
	var tdLabelLZ = document.createElement("TD");
	tdLabelLZ.innerHTML = "<b> Postal Code </b>";
	var tdLabelCost = document.createElement("TD");
	tdLabelCost.innerHTML = "<b> Cost </b>";
	var tdLabelDate = document.createElement("TD");
	tdLabelDate.innerHTML = "<b> Date </b>";
	var tdLabelStart = document.createElement("TD");
	tdLabelStart.innerHTML = "<b> Start Date </b>";
	var tdLabelEnd = document.createElement("TD");
	tdLabelEnd.innerHTML = "<b> End Date </b>";
	var tdLabelEnd = document.createElement("TD");
	tdLabelEnd.innerHTML = "<b> End Date </b>";
	var tdLabelHours = document.createElement("TD");
	tdLabelHours.innerHTML = "<b> Hours Spent </b>";
	var tdLabelStatus = document.createElement("TD");
	tdLabelStatus.innerHTML = "<b> Status </b>";
	var tdLabelBenco = document.createElement("TD");
	tdLabelBenco.innerHTML = "<b> BenCo Associate </b>";
	
	
	trLabel1.appendChild(tdLabelID);
	trLabel1.appendChild(tdLabelEmpID);
	trLabel1.appendChild(tdLabelType);
	trLabel1.appendChild(tdLabelDesc);
	trLabel1.appendChild(tdLabelJust);
	trLabel1.appendChild(tdLabelJust);
	trLabel1.appendChild(tdLabelLN);
	trLabel1.appendChild(tdLabelLS);
	trLabel1.appendChild(tdLabelLC);
	trLabel1.appendChild(tdLabelLSt);
	trLabel1.appendChild(tdLabelLZ)
	trLabel1.appendChild(tdLabelCost);
	trLabel1.appendChild(tdLabelDate);
	trLabel1.appendChild(tdLabelStart);
	trLabel1.appendChild(tdLabelEnd);
	trLabel1.appendChild(tdLabelHours);
	trLabel1.appendChild(tdLabelStatus);
	trLabel1.appendChild(tdLabelBenco);
	appTable.appendChild(trLabel1);
	
	var i;
	for (i = 0; i < reqItems.length; i++) {
		var tr = document.createElement("TR");
		if(i != 0){
			if(i%2 == 0){
				
				tr.style.backgroundColor = "rgba(240,240,240,0.75)";
			}else {
				tr.style.backgroundColor = "rgba(200,200,200,0.75)";
			}
		}else {
			tr.style.backgroundColor = "rgba(240,240,240,0.75)";
		}
		var appID = document.createElement("TD");
		appID.innerHTML = reqItems[i].id;

		var appEmployeeID = document.createElement("TD");
		appEmployeeID.innerHTML = reqItems[i].empId;

		var appType = document.createElement("TD");
		appType.innerHTML = reqItems[i].type;

		var appDesc = document.createElement("TD");
		appDesc.innerHTML = reqItems[i].description;

		var appJust = document.createElement("TD");
		appJust.innerHTML = reqItems[i].justification;

		var appLocationN = document.createElement("TD");
		appLocationN.innerHTML = reqItems[i].lName;

		var appLocationS = document.createElement("TD");
		appLocationS.innerHTML = reqItems[i].lStreet;

		var appLocationC = document.createElement("TD");
		appLocationC.innerHTML = reqItems[i].lCity;

		var appLocationSt = document.createElement("TD");
		appLocationSt.innerHTML = reqItems[i].lState;

		var appLocationZ = document.createElement("TD");
		appLocationZ.innerHTML = reqItems[i].lZip;

		var appCost = document.createElement("TD");
		appCost.innerHTML = reqItems[i].cost;

		var appDate = document.createElement("TD");
		appDate.innerHTML = reqItems[i].aDate;

		var appStart = document.createElement("TD");
		appStart.innerHTML = reqItems[i].sDate;

		var appEnd = document.createElement("TD");
		appEnd.innerHTML = reqItems[i].eDate;

		var appHours = document.createElement("TD");
		appHours.innerHTML = reqItems[i].hours;

		var appStatus = document.createElement("TD");
		appStatus.innerHTML = reqItems[i].status;

		var appBenco = document.createElement("TD");
		appBenco.innerHTML = reqItems[i].bCo;

		var butApp = document.createElement("BUTTON");
		butApp.id = i;
		butApp.innerHTML = "Approve";
		butApp.onclick = function() {
			alert("Approved")
		};

		var butDen = document.createElement("BUTTON");
		butDen.id = i;
		butDen.innerHTML = "Deny";
		butDen.onclick = function() {
			alert("Denied")
		};

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
var requestID;
function requestTableGen(passin) {
	var reqTable = document.createElement("TABLE");
	reqTable.border = 1;
	reqTable.id ="req";
	var trLabel = document.createElement("TR");
	trLabel.style.backgroundColor = "rgba(180,180,180,0.75)";
	var tdLabelID = document.createElement("TD");
	tdLabelID.innerHTML = "<b> ID </b>"
	var tdLabelType = document.createElement("TD");
	tdLabelType.innerHTML = "<b> Request Type </b>"
	var tdLabelDesc = document.createElement("TD");
	tdLabelDesc.innerHTML = "<b> Description </b>"
	var tdLabelStatus = document.createElement("TD");
	tdLabelStatus.innerHTML = "<b> Status </b>";
	
	trLabel.appendChild(tdLabelID);
	trLabel.appendChild(tdLabelType);
	trLabel.appendChild(tdLabelDesc);
	trLabel.appendChild(tdLabelStatus);
	reqTable.appendChild(trLabel);
	var i;
	for (i = 0; i < passin.length; i++) {
		var tr = document.createElement("TR");
		if(i != 0){
			if(i%2 == 0){
				
				tr.style.backgroundColor = "rgba(240,240,240,0.75)";
			}else {
				tr.style.backgroundColor = "rgba(200,200,200,0.75)";
			}
		}else {
			tr.style.backgroundColor = "rgba(240,240,240,0.75)";
		}
		var reqID = document.createElement("TD");
		reqID.innerHTML = passin[i].id;
		var reqType = document.createElement("TD");
		reqType.innerHTML = passin[i].type;
		var reqDesc = document.createElement("TD");
		reqDesc.innerHTML = passin[i].description;
		var reqStatus = document.createElement("TD");
		reqStatus.innerHTML = passin[i].status;
		var but = document.createElement("BUTTON");
		but.id = i;
		but.setAttribute("data-toggle", "modal");
		but.setAttribute("data-target", "#imgModal");
		but.innerHTML = "Send File";
		but.onclick = function() {
			requestID = this.id;
			
		};
		
		tr.appendChild(reqID);
		tr.appendChild(reqType);
		tr.appendChild(reqDesc);
		tr.appendChild(reqStatus);
		tr.appendChild(but);
		reqTable.appendChild(tr);
	}
	document.getElementById("requests").appendChild(reqTable);
}

function loginRequest() {

	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			var person = JSON.parse(xhr.responseText);
			populate(person);
			document.getElementById("login").style.visibility = "hidden";
			document.getElementById("logout").style.visibility = "visible";
			document.getElementById("nrequest").style.visibility = "visible";
		}

	}
	
	/*if(document.getElementById("uname").value == "lexoz" && document.getElementById("pwd").value == "openthedoor"){
		document.getElementById("login").style.visibility = "hidden";
		document.getElementById("logout").style.visibility = "visible";
		document.getElementById("nrequest").style.visibility = "visible";
		requestTableGen(empReq);
		approvalTableGen(supervisorApp);
	}*/
	
	let employee;
	xhr.open("POST", "/login", true);
	xhr.send(JSON.stringify(employee = {
		username : document.getElementById("uname").value,
		password : document.getElementById("pwd").value
	}));

}

function logout() {
	document.getElementById("login").style.visibility = "visible";
	document.getElementById("logout").style.visibility = "hidden";
	document.getElementById("nrequest").style.visibility = "hidden";
	document.getElementById("req").parentNode.removeChild(document.getElementById("req"));
	document.getElementById("app").parentNode.removeChild(document.getElementById("app"));
}



function setCookie(person) {
	document.cookie = "employeeid=" + person.id;
}
