package br.com.infotravel.api.commonv1.dto;

import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiActivePeriod {

	@JsonSerialize(using = CustomDateSerializer.class)
	private Date startDate;
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date endDate;
	private Integer[] weekDays;

	public ApiActivePeriod() {
	}

	public ApiActivePeriod(Date startDate, Date endDate, Integer[] weekDays) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.weekDays = weekDays;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer[] getWeekDays() {
		return weekDays;
	}

	public void setWeekDays(Integer[] weekDays) {
		this.weekDays = weekDays;
	}
}
