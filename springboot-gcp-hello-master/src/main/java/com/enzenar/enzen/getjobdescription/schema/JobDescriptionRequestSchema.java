package com.enzenar.enzen.getjobdescription.schema;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"job_id",
"user_id"
})
public class JobDescriptionRequestSchema {

@JsonProperty("job_id")
private String job_id;
@JsonProperty("user_id")
private String user_id;

public String getUser_id() {
	return user_id;
}

public void setUser_id(String user_id) {
	this.user_id = user_id;
}

public String getJob_id() {
	return job_id;
}

public void setJob_id(String job_id) {
	this.job_id = job_id;
}


}
