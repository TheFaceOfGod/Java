let enemies;
async function init(){
  let link = "https://symmetrical-orbit-g4rq9pwrggjwcwpjv-8300.app.github.dev";
  let route= "/enemies"
  info = await fetch(link+route);
  console.log(info);
  enemies = await info.json();
  console.log(enemies);
  generateCards(enemies);
}

function generateCards(enemies){
  let centerpanel = document.getElementById("centerpanel");
  centerpanel.innerHTML = "";
  let front = "";
  let back = "";
  let card= ""
  for(let i=0; i<enemies.length; i++){
    let enemy = enemies[i];
    front = `<h2>${enemy.enemyName}</h2>`;
    front += `<h2>${enemy.enemyID}</h2>`;
    front += `<h2>${enemy.enemyTrait}</h2>`;
    back = `<p>${enemy.enemyDescription}</p>`;
    back += `<img src="catgameimages/${enemy.enemyName}.png">`;
    card = new FlipCard(front,back);
    card.render("centerpanel");
  }
}

function filter(){
  let name = document.getElementById("enemyName").value;
  console.log(name);

  let newEnemies = []; 
  
  for(let i=0; i<enemies.length; i++){
    let enemy = enemies[i];
    if(enemy.enemyName == name){
          newEnemies.push(enemy);
       }
  }
  console.log(`number found ${newEnemies.length}`)
  generateCards(newEnemies);
  
}
function filterdrop(){
  let name2 = document.getElementById("enemyTrait").value;
  console.log(name2);

  let newEnemies2 = []; 
  
  for(let i=0; i<enemies.length; i++){
    let enemy = enemies[i];
    if(enemy.enemyTrait == name2){
          newEnemies2.push(enemy);
       }
  }
  console.log(`number found ${newEnemies2.length}`)
  generateCards(newEnemies2);
  
}