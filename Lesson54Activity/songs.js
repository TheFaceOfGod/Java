
let data,songs;
function init(){
  $.ajaxSetup({async: false});
  
  let link = "https://raw.githubusercontent.com/PorchettaEP/JSONFILES/refs/heads/main";
  let route= "/songs"
  songs = $.getJSON(link+route).responseJSON;

  generateCards(songs);

}

function generateCards(songs){
  let output = document.getElementById("mainpanel");
  let build ="";
  
  for(let i=0; i<songs.length; i++){
    let song = songs[i]
    build += `<div class="card" >`
    build += `<h3> Song Name </h3>`;
    build += `<p> ${song.Name}</p>`;
    build += `<div> Album </div>`;
    build += `<div2> ${song.Title} </div2>`;
    build += `<div> Composer </div>`;
    build += `<div2> ${song.Composer}</div2>`;
    build += `<hr>`;
    build += `</div>`;
  }

  output.innerHTML = build;

}

function filter(){
  let name = document.getElementById("songname").value;

  let newSongs = []; 
  
  for(let i=0; i<songs.length;i++){
    let song = songs[i] 
    if( song.Name == name ) {
          newSongs.push(song);
       }
  }
  generateCards(newSongs);
  
}
