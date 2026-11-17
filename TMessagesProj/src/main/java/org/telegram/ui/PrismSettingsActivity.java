package org.telegram.ui;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.LayoutHelper;

public class PrismSettingsActivity extends BaseFragment {

    @Override
    public View createView(Context context) {
        // Настраиваем стандартный actionBar
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        actionBar.setTitle("Настройки Prism");
        actionBar.setAllowOverlayTitle(true);
        
        // Обработчик кнопки назад
        actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int id) {
                if (id == -1) {
                    finishFragment();
                }
            }
        });

        // Создаём основной view
        fragmentView = new FrameLayout(context);
        FrameLayout frameLayout = (FrameLayout) fragmentView;
        frameLayout.setBackgroundColor(0xffffffff); // Белый фон

        // Создаём текст
        TextView textView = new TextView(context);
        textView.setText("Это ещё в разработке, кнопочка не работает :3");
        textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 18);
        textView.setTextColor(0xff888888); // Серый цвет
        textView.setGravity(Gravity.CENTER);
        
        // Добавляем текст в центр экрана
        frameLayout.addView(textView, LayoutHelper.createFrame(
            LayoutHelper.MATCH_PARENT, 
            LayoutHelper.WRAP_CONTENT, 
            Gravity.CENTER
        ));

        return fragmentView;
    }
}