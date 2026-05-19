let cats;
async function init(){
  let link = "https://symmetrical-orbit-g4rq9pwrggjwcwpjv-8300.app.github.dev";
  let route= "/cats"
  info = await fetch(link+route);
  console.log(info);
  cats = await info.json();
  console.log(cats);
  generateCards(cats);
}

function generateCards(cats){
  let centerpanel = document.getElementById("centerpanel");
  centerpanel.innerHTML = "";
  let front = "";
  let back = "";
  let card= ""
  for(let i=0; i<cats.length; i++){
    let cat = cats[i];
    front = `<h2>${cat.catName}</h2>`;
    front += `<h2>${cat.catID}</h2>`;
    front += `<h2>${cat.catRarity}</h2>`;
    back = `<p>${cat.catDescription}</p>`;
    back += `<img src="catgameimages/${cat.catID}.png">`;
    card = new FlipCard(front,back);
    card.render("centerpanel");
  }
}

function filter(){
  let name = document.getElementById("catName").value;
  console.log(name);

  let newCats = []; 
  
  for(let i=0; i<cats.length; i++){
    let cat = cats[i];
    if(cat.catName == name){
          newCats.push(cat);
       }
  }
  console.log(`number found ${newCats.length}`)
  generateCards(newCats);
  
}
