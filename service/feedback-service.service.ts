import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { Feedback } from '../models/feedback';

@Injectable({
  providedIn: 'root'
})
export class FeedbackServiceService {

  private baseUrl:string="http://localhost:8081/animal_rescue/Feedback"
  constructor(private http:HttpClient ) { }
  newFeedback(f:Feedback):Observable<Feedback>
  {
  return this.http.post<Feedback>(`${this.baseUrl}`,f);
  }
  getAll():Observable<Feedback[]>{
    return this.http.get<Feedback[]>(`${this.baseUrl}`);
    }
  }


