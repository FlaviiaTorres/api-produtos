import './App.css';
import Tabela from './tabela';
import Formulario from './formulario';
import React, { useEffect, useState } from "react";


function App() {

  const produto = {
    codigo : 0,
    nome : '',
    marca : ''
  }

const [btnCadastrar, setbtnCadastrar] = useState(true);
const [produtos, setProdutos] = useState([]);
const [objProdutos, setObjProdutos] = useState([produto]);

//UseEffect
useEffect(()=>{
  fetch("http://localhost:8080/listar")
  .then(retorno => retorno.json())
  .then(retorno_convertido => setProdutos(retorno_convertido));
}, []);

  return (
    <div>
     <p>{JSON.stringify(objProdutos)}</p>
      <Formulario botao={btnCadastrar} />
      <Tabela vetor={produtos} />
    </div>
  );
}

export default App;
