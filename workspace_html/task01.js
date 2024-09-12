let taskAdd = document.querySelector("#task-add");

let taskCont = document.querySelector(".task-cont");
let taskList = document.querySelector(".task-list");

let task = document.querySelectorAll(".task-list-cont input[type='checkbox']");
let task_n = task.length;
let taskEntry = task[task_n];

let taskDelete = document.querySelectorAll(".task-delete");

let ans = 0;



taskAdd.addEventListener("click", () =>{
  taskList.style.display = 'block';
  taskCont.style.height = '280px';
  setTimeout(() => {
    ans = prompt("추가할 할일을 입력하세요.");
    
    let newList = taskEntry;
    // newList.firstChild.firstChild.textContent = ans
    taskList.appendChild(newList);


  },100);

})

for (let i = 0; i < task.length; i++){
  task[i].addEventListener("click", () => {
    let tmp = task[i].parentNode.parentNode
    console.log(task[i].checked);
    tmp.style.backgroundColor = task[i].checked ? 'lightgreen' : 'white';
  })
}

taskDelete.addEventListener("click", () => {
  if(!confirm("삭제하시겠습니까?")) return;
})