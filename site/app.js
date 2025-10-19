const roomList = document.getElementById('room-list');
const addSample = document.getElementById('add-sample');

let rooms = [];

function render() {
  roomList.innerHTML = '';
  rooms.forEach(r => {
    const li = document.createElement('li');
    li.className = 'room';
    li.innerHTML = `<div>${r.number} — ${r.occupants}/${r.capacity}</div>`;
    const actions = document.createElement('div');
    const book = document.createElement('button');
    book.textContent = 'Book';
    book.disabled = r.occupants >= r.capacity;
    book.onclick = () => { r.occupants++; render(); };
    const checkout = document.createElement('button');
    checkout.textContent = 'Checkout';
    checkout.onclick = () => { if (r.occupants>0) r.occupants--; render(); };
    actions.appendChild(book);
    actions.appendChild(checkout);
    li.appendChild(actions);
    roomList.appendChild(li);
  })
}

addSample.onclick = () => {
  rooms = [{number:101,capacity:2,occupants:0},{number:102,capacity:3,occupants:0}];
  render();
};

render();
