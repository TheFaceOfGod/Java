let data,customers;
function init(){
  $.ajaxSetup({async: false});
  
  let link = "https://raw.githubusercontent.com/PorchettaEP/JSONFILES/refs/heads/main";
  let route= "/customers"
  customers = $.getJSON(link+route).responseJSON;

  generateCards(customers)


}

function generateCards(customers){
  let centerpanel = document.getElementById("centerpanel");
  let front = "";
  let back = "";
  for(let i=0; i<customers.length; i++){
    let customer = customers[i];
    front = `<h2>${customer.FirstName}</h2>`;
    front += `<h2>${customer.LastName}</h2>`;
    front += '<h2>${customer.ID}</h2>';
    front += '<h2>${customer.Email}</h2>';
    back = '<h1>${customer.Country}</h1>';
    back += '<img src="countries/${customer.Country}.PNG">';
    card = new FlipCard(front,back);
    card.render("centerpanel");

  }

    

}

function filter(){
  let country = document.getElementById("country").value;
  console.log(country);

  let customerList = []; //create a list of songs searched for
  
  for(let i=0; i<customers.length;i++){
    let customer = customers[i] //get each sog
    //make sure the list is no
    if( customer.Country == country ) {
          //add to the new list
          customerList.push(customer);
       }
  }
  console.log(`number found ${customerList.length}`)
  generateCards(customerList);
  
}