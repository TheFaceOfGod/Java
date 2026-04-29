let customers;
function init(){
  $.ajaxSetup({async: false});
  
  let link = "https://symmetrical-orbit-g4rq9pwrggjwcwpjv-8500.app.github.dev";
  let route= "/customers"
  customers = $.getJSON(link+route).responseJSON;
  console.log(customers);
  generateCards(customers)


}

function generateCards(customers){
  let centerpanel = document.getElementById("mainpanel");
  let build ="";

  for(let i=0; i<customers.length; i++){
    let customer = customers[i]
    build += `<div class="card" >`
    build += `<h3> Customer ID : ${customer.CustomerId}</h3>`;
    build += `<div> First Name : ${customer.FirstName}</div>`;
    build += `<div> Last Name : ${customer.LastName}</div>`;
    build += `<div> Country : ${customer.Country}</div>`;
    build += `<p> Email : ${customer.Email}</p>`;
    build += `<img src='countries/${customer.Country}.PNG'>`;
    build += `<hr>`;
    build += `</div>`;
  }


  centerpanel.innerHTML = build;
  

}

function filter(){
  let country = document.getElementById("country").value;
  console.log(country);

  let customerList = []; 
  
  for(let i=0; i<customers.length;i++){
    let customer = customers[i] 
    if( customer.Country == country ) {

          customerList.push(customer);
       }
  }
  console.log(`number found ${customerList.length}`)
  generateCards(customerList);
  
}