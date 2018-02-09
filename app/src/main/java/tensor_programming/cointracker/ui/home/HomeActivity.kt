package tensor_programming.cointracker.ui.home

import android.os.Bundle
import tensor_programming.cointracker.MainActivity
import tensor_programming.cointracker.base.BaseActivity

/**
 * Created by Tensor on 2/8/2018.
 */
class HomeActivity: BaseActivity() {
    override fun initInjection() {
        (application as MainActivity).cryptoDeps.inject(this)
    }

    override fun setUpLayout() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}