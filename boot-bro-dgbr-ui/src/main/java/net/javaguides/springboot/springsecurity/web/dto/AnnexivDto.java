package net.javaguides.springboot.springsecurity.web.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class AnnexivDto extends ProjectDto {
 
	private Integer id;
	private String nameRoad;
	private String nameWork;
	private Integer jobNoRoute;
	private Integer jobNoSr;
	private String remark;
	private Integer beYearSrNo;
	private Integer brdpProgNo;
	private Integer ltrowpNo;
	private String sanctionedStatus;
	private Integer locFromKmToKm;
	private String typeWork;
	private String specRoadExisting;
	private String specRoadProposed;
	private String pkg; 
	private Integer tf;  
	private Integer unit;
	private Date dateOfSanction;
	private Integer aaRaaAeAmount;
	private Integer tsFmnKmCi9;
	private Integer tsSurfKmCi9;
	private Integer tsPmtWksInr;
	private Integer tsMajBrInMtr;
	private Integer tsTunnelInMtf;
	private Integer abFmnKmCi9;
	private Integer abSurfKmCi9;
	private Integer abPmtWksInr;
	private Integer abMajBrInMtr;
	private Integer abTunnelInMtf;
	private Integer abTotalCostWks;
	private Integer awpFmnKmCi9;
	private Integer awpSurfKmCi;
	private Integer awpPmtWks;
	private Integer awpMajBrInMtr;
	private Integer awpTunnelInMts;
	private Integer awpTotalCostWks;
	private String majorHeads;
	private String modeExecution;
	private String ministry;
	private String adgs;
	private Integer crFmnKmCi9;
	private Integer crSurfKmCi9;
	private Integer crMajBrInMtr;
	private Integer crTunnelInMtr; 
}
