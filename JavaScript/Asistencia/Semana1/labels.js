start: for (let conteoContinue = 0; conteoContinue <= 10; conteoContinue++) {
  if (conteoContinue % 2 !== 0) {
    break start;
  }
  console.log(conteoContinue);
}
console.log("End inicio...");
