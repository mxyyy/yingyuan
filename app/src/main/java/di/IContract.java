package di;

import java.util.List;

import bean.Bean;

public interface IContract {
    /*
    * iview
    * */
    interface  iview{
        void showData(List<Bean.ResultBean.NearbyCinemaListBean>message);
    }
    /*
     * ipresenter
     * */
    interface ipresenter<iview>{
        void attachView(iview iview);
        void detachView(iview iview);
        void requestInfo();
    }
    /*
     * imodule
     * */
    interface imodule{
        interface calllisten{
            void responmsg(List<Bean.ResultBean.NearbyCinemaListBean>messageq);
        }
        void requestData(calllisten calllisten);
    }
}
