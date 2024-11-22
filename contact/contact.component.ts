import { Component } from '@angular/core';
import { Contact } from '../models/contact';
import { ContactServiceService } from '../service/contact-service.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-contact',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './contact.component.html',
  styleUrl: './contact.component.css'
})
export class ContactComponent {
  c:Contact=new Contact();
  
  constructor(private cServ:ContactServiceService)
  {
  
  }
  submitdata()
  {
    this.cServ.newcontact(this.c).subscribe((data:Contact)=>{
      if(data!=null)
        {
          alert('Store Successful')
          console.log(data)
        }
    })
  }
  
  }

