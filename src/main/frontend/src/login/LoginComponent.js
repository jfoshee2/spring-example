import React, { Component } from 'react';

class LoginComponent extends Component{
    constructor(){
        super();
        this.handleUserNameChange = this.handleUserNameChange.bind(this);
        this.handlePasswordChange = this.handlePasswordChange.bind(this);
        this.submit = this.submit.bind(this);
        console.log("inside constructor");
    }

    state = {
        userName:"",
        password:""
    };

    componentDidMount(){
        console.log("inside did mount");
    }

    handleUserNameChange(event){
        this.setState({ userName: event.target.value });
    }

    handlePasswordChange(event){
        this.setState({ password: event.target.value });
    }

    submit(){
        alert(this.state.userName + " " + this.state.password)
        fetch('/Login', {
            method: 'POST',
            header: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                name: this.state.userName,
                password: this.state.password
            })
        }).then( response => {
            alert("request complete")
        }).catch( error=> {
            alert("something went wrong")
        });
    }

    render(){
        return(
        <div>
            <form onSubmit={this.submit}>
               <input type="text"
                    className="input"
                    value={this.state.userName}
                    onChange={this.handleUserNameChange}
                    placeholder="Username"/>
               <br></br>
               <input type="text"
                    className="input"
                    value={this.state.password}
                    onChange={this.handlePasswordChange}
                    placeholder="Password"/>
               <br></br>
               <button className="submit-button" type="submit">Login</button>
            </form>
            <br></br>
        </div>
        )
    }
}

export default LoginComponent;