package youth.blservice;

import org.springframework.web.bind.annotation.PathVariable;
import youth.bean.*;

import java.util.List;

public interface StatisticsBLService {


    public List<CompanyDescOutputBean> getCompanyKeywords(String companyName);
    public List<JobDescOutputBean> getJobKeywordsByJobId( String jobId);



}
