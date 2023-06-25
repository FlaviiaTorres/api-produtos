import './App.css';
import Tabela from './tabela';
import Formulario from './formulario';
import React, { useEffect, useState } from "react";


function App() {

const [btnCadastrar, setbtnCadastrar] = useState(true);
const [produtos, setProdutos] = useState([]);

//UseEffect
useEffect(()=>{
  fetch("http://localhost:8080/listar")
  .then(retorno => retorno.json())
  .then(retorno_convertido => setProdutos(retorno_convertido));
}, []);

  return (
    <div>
      <p>{JSON.stringify(produtos)}</p>
      <Formulario botao={btnCadastrar} />
      <Tabela />
    </div>
  );
}

export default App;
