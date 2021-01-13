import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import LoginComponent from './login/LoginComponent';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1 className="login">Login</h1>
        <LoginComponent/>
        <br></br>

        {/* <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a> */}
      </header>
    </div>
  );
}

export default App;
