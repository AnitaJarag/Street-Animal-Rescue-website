import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ServiceComponent } from './service/service.component';
import { ContactComponent } from './contact/contact.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { ViewRegisterComponent } from './view-register/view-register.component';
import { ViewFeedbackComponent } from './view-feedback/view-feedback.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';

export const routes: Routes = [
{'path':'',component:HomeComponent},
{'path':'aboutus',component:AboutusComponent},
{'path':'service',component:ServiceComponent},
{'path':'contact',component:ContactComponent},
{'path':'feedback',component:FeedbackComponent},
{'path':'login',component:LoginComponent},
{'path':'register',component:RegisterComponent},
{'path':'adminlogin',component:AdminloginComponent},
{'path':'viewregister',component:ViewRegisterComponent},
{'path':'viewfeedback',component:ViewFeedbackComponent},
];
