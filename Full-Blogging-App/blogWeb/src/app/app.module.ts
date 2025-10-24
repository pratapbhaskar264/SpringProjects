import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

// Angular Material modules (example, adjust based on your AngularMaterialModule)
import { AngularMaterialModule } from './AngularMaterialModule';

// Root component
import { AppComponent } from './app.component';

// Routing
import { AppRoutingModule } from './app-routing.module';

// Optional: If you have additional components
// import { SomeComponent } from './components/some.component';
// import { AnotherComponent } from './components/another.component';

@NgModule({
  declarations: [
    AppComponent,
    // Add your other components here
    // SomeComponent,
    // AnotherComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    AngularMaterialModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
