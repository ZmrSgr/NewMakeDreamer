package cn.sgr.zmr.com.sgr.Modules.My.More.Disclaimer;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * Created by 沈国荣 on 2016/9/7 0007.
 */
public class DisclaimerPresenter implements DisclaimerContract.Presenter {


    @NonNull
    private final DisclaimerContract.View registerView;
    Context context;
    public DisclaimerPresenter(Context contexts, @NonNull DisclaimerContract.View registerView) {
        this.context=contexts;
        this.registerView = registerView;
        registerView.setPresenter(this);//互相拥有对象
    }

    @Override
    public void start() {

    }
}
