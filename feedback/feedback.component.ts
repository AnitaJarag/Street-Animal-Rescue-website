import { Component } from '@angular/core';
import { Feedback } from '../models/feedback';
import { FeedbackServiceService } from '../service/feedback-service.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { domainToASCII } from 'url';

@Component({
  selector: 'app-feedback',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './feedback.component.html',
  styleUrl: './feedback.component.css'
})
export class FeedbackComponent {
f:Feedback=new Feedback();
constructor(private fserv:FeedbackServiceService)
{

}
submitdata()
{
  //this.f.emailaddress=localStorage.getItem("emailaddress")
  this.fserv.newFeedback(this.f).subscribe((data:Feedback)=>{
    if(data!=null){
      alert('Thank you for feedback')
      console.log(data)
    }
  })
}
}
