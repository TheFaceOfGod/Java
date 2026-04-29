let data,tracks;
async function init(){
  $.ajaxSetup({async: false});
  let link = "https://symmetrical-orbit-g4rq9pwrggjwcwpjv-8500.app.github.dev";
  let route= "/tracks"
  info = await fetch(link+route);
  tracks = await info.json();
  console.log(tracks);

  cards(tracks);
}
function cards(tracks){
  let output = document.getElementById("mainpanel");
  let build ="";
  for(let i=0; i<tracks.length; i++){
    let track = tracks[i];
    build += `<div class="card" >`;
    build += `<h3> Song Name </h3>`;
    build += `<p> ${track.Name}</p>`;
    build += `<div> Album </div>`;
    build += `<div> ${track.Title} </div>`;
    build += `<div> Composer </div>`;
    build += `<div> ${track.Composer}</div>`;
    build += `</div>`;
  }
  output.innerHTML = build;

}