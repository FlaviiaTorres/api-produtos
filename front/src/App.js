import './App.css';
import Tabela from './tabela';
import Formulario from './formulario';
import React, { useEffect, useState } from "react";


function App() {

const [btnCadastrar, setbtnCadastrar] = useState(true);

  return (
    <div>
      <Formulario botao={btnCadastrar} />
      <Tabela />
    </div>
  );
}

export default App;
