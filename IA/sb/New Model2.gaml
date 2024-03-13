/**
* Name: NewModel2
* Based on the internal empty template. 
* Author: jd
* Tags: 
*/


model NewModel2

global {
	int n_people <- 20;
	float agent_speed <- 1.0;
	float step <- 1 #minutes;
	geometry shape <- envelope(square(500 #m));
	
	init {
		create people number: n_people {
			speed <- agent_speed;
		}
	}
	
}

species people skills: [moving] {
	
	reflex move {
		do wander;
	}
	
	aspect default {
		draw circle(5) color: #green;
	}
}

species room {
	
}

species ocupation_sensor {
	
}

species temperature_sensor {
	
}

species light_switch {
	
}

species AC_switch {
	
}

experiment main_experiment type: gui {
	
}

