package com.enzenar.enzen.submitfinalreport.schema;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"issueDetail",
"username",
"issueStatus",
"job_id"
})
public class SubmitReportRequestSchema {

@JsonProperty("issueDetail")
private String issueDetail;
@JsonProperty("username")
private String username;

@JsonProperty("issueStatus")
private String issueStatus;

@JsonProperty("job_id")
private String job_id;

public String getJob_id() {
	return job_id;
}

public void setJob_id(String job_id) {
	this.job_id = job_id;
}

@JsonProperty("issueDetail")
public String getIssueDetail() {
return issueDetail;
}

@JsonProperty("issueDetail")
public void setIssueDetail(String issueDetail) {
this.issueDetail = issueDetail;
}

@JsonProperty("username")
public String getUsername() {
return username;
}

@JsonProperty("username")
public void setUsername(String username) {
this.username = username;
}

public String getIssueStatus() {
	return issueStatus;
}

public void setIssueStatus(String issueStatus) {
	this.issueStatus = issueStatus;
}

}
