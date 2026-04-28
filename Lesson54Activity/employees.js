let employees;
function init(){
  $.ajaxSetup({async: false});
  let link = "https://raw.githubusercontent.com/PorchettaEP/JSONFILES/refs/heads/main";
  let route= "/employees"
  employees = $.getJSON(link+route).responseJSON;
  generateCards(employees);
}

function generateCards(employees){
  let mainpanel = document.getElementById("mainpanel");
  let build ="";
  for(let i=0; i<employees.length; i++){
    let employee = employees[i]
    build += `<div class="card" >`
    build += `<h3> Employee ID : ${employee.EmployeeId}</h3>`;
    build += `<div> First Name : ${employee.FirstName}</div>`;
    build += `<div> Last Name : ${employee.LastName}</div>`;
    build += `<p> City : ${employee.City}</p>`;
    build += `<img src="cities/${employee.City}.PNG">`;
    build += `<hr>`;
    build += `</div>`;
  }
  mainpanel.innerHTML = build;
}

function filter(){
  let city = document.getElementById("city").value;
  console.log(city);
  let newEmployees = [];
  for(let i=0; i<employees.length;i++){
    let employee = employees[i]
    if( employee.City == city ) {
          newEmployees.push(employee);
       }
  }
  console.log(`number found ${newEmployees.length}`)
  generateCards(newEmployees);
}