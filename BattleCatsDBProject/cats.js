let data,cats;
function init(){
  $.ajaxSetup({async: false});
  
  let link = "https://symmetrical-orbit-g4rq9pwrggjwcwpjv-5500.app.github.dev/BattleCatsDBProject";
  let route= "/cats"
  cats = $.getJSON(link+route).responseJSON;

  generateCards(cats);
  console.log(cats);
}

function generateCards(customers){
  let centerpanel = document.getElementById("centerpanel");
  let front = "";
  let back = "";
  for(let i=0; i<cats.length; i++){
    let cat = cats[i];
    front = `<h2>${cat.catName}</h2>`;
    front += `<h2>${cat.catID}</h2>`;
    front += `<h2>${cat.catRarity}</h2>`;
    back = `<p>${cat.catDescription}</p>`;
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