import { Component } from '@angular/core';
import {LoginProvider} from './shared/loginProvider'

/**
 * Generated class for the LoginComponent component.
 *
 * See https://angular.io/api/core/Component for more info on Angular
 * Components.
 */
@Component({
  selector: 'login',
  templateUrl: 'login.html'
})
export class LoginComponent {

  text: string;

  constructor(public loginp : LoginProvider) {
    console.log('Hello LoginComponent Component');
    this.text = 'Hello World';
  }
  
  login(){
    this.loginp.login({username: 'waiter', password: 'waiter'});
  }
}