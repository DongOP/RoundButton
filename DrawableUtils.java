package com.apicloud.moduleDemo;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;

public class DrawableUtils {

	public static Drawable getSelectedStateDrawable(Drawable normal,
			Drawable selected) {
		StateListDrawable drawable = new StateListDrawable();

		drawable.addState(new int[] { -android.R.attr.state_selected }, normal);

		drawable.addState(new int[] { android.R.attr.state_selected }, selected);
		return drawable;
	}

	/**
	 * 
	 * @param normal
	 *            int型色值 ，Color.WHITE 类型
	 * @param selected
	 *            int型色值，Color.WHITE 类型
	 * @return
	 */
	public static Drawable getSelectedStateDrawableByColor(int normalcolor,
			int selectedcolor) {
		// StateListDrawable drawable = new StateListDrawable();
		// drawable.addState(new int[]{ -android.R.attr.state_selected}, new
		// ColorDrawable(normal));
		// drawable.addState(new int[]{ android.R.attr.state_selected}, new
		// ColorDrawable(selected));

		Drawable normal = new ColorDrawable(normalcolor);
		Drawable selected = new ColorDrawable(selectedcolor);
		return getSelectedStateDrawable(normal, selected);

	}

	/**
	 * 
	 * @param context
	 * @param normalcolor_id
	 *            资源id, 如 R.color.white
	 * @param selectedcolor_id
	 *            资源id, 如 R.color.white
	 * @return
	 */
	public static Drawable getSelectedStateDrawableByResColor(Context context,
			int normalcolor_id, int selectedcolor_id) {
		// StateListDrawable drawable = new StateListDrawable();
		// drawable.addState(new int[]{- android.R.attr.state_selected}, new
		// ColorDrawable( context.getResources().getColor(normalcolor_id)));
		// drawable.addState(new int[]{ android.R.attr.state_selected}, new
		// ColorDrawable( context.getResources().getColor(selectedcolor_id)));

		Drawable normal = new ColorDrawable(context.getResources().getColor(
				normalcolor_id));
		Drawable selected = new ColorDrawable(context.getResources().getColor(
				selectedcolor_id));

		return getSelectedStateDrawable(normal, selected);
	}

	/**
	 * 
	 * @param context
	 * @param normal_strokecolor_id
	 *            资源id, 如 R.color.white
	 * @param normal_fillcolor_id
	 *            资源id, 如 R.color.white
	 * @param normal_strokeWidth
	 *            边框宽度
	 * @param normal_cornerRadius
	 *            圆角半径
	 * @param selected_strokecolor_id
	 *            资源id, 如 R.color.white
	 * @param selected_fillcolor_id
	 *            资源id, 如 R.color.white
	 * @param selected_strokeWidth
	 *            边框宽度
	 * @param selected_cornerRadius
	 *            圆角半径
	 * @return
	 */
	public static Drawable getSelectedStateShapeDrawable(Context context,
			int normal_strokecolor_id, int normal_fillcolor_id,
			int normal_strokeWidth, int normal_cornerRadius_lefttop,
			int normal_cornerRadius_righttop,
			int normal_cornerRadius_rightbottom,
			int normal_cornerRadius_leftbottom, int selected_strokecolor_id,
			int selected_fillcolor_id, int selected_strokeWidth,
			int selected_cornerRadius_lefttop, int selected_cornerRadius_righttop,
			int selected_cornerRadius_rightbottom,
			int selected_cornerRadius_leftbottom) {

		GradientDrawable normaldrawable = new GradientDrawable();// 创建drawable
		normaldrawable.setColor(context.getResources().getColor(
				normal_fillcolor_id));
		// normaldrawable.setCornerRadius(normal_cornerRadius);

		normaldrawable.setCornerRadii(new float[] { 50, 10, 30, 50, 60, 60,
				100, 100 }); // 以此是左上角，右上角，右下角，左下角

		normaldrawable.setStroke(normal_strokeWidth, context.getResources()
				.getColor(normal_strokecolor_id));

		GradientDrawable selecteddrawable = new GradientDrawable();// 创建drawable
		selecteddrawable.setColor(context.getResources().getColor(
				selected_fillcolor_id));
		selecteddrawable.setCornerRadius(2);
		selecteddrawable.setStroke(selected_strokeWidth, context.getResources()
				.getColor(selected_strokecolor_id));

		return getSelectedStateDrawable(normaldrawable, selecteddrawable);
	}
	/**
	 * 
	 * @param context
	 * @param normal_strokecolor    int型色值, 如 Color.WHITE 类型
	 * @param normal_fillcolor      int型色值, 如 Color.WHITE 类型
	 * @param normal_strokeWidth       边框宽度
	 * @param normal_cornerRadius_lefttop
	 * @param normal_cornerRadius_righttop
	 * @param normal_cornerRadius_rightbottom
	 * @param normal_cornerRadius_leftbottom
	 * @param selected_strokecolor int型色值, 如 Color.WHITE 类型
	 * @param selected_fillcolor int型色值, 如 Color.WHITE 类型
	 * @param selected_strokeWidth  边框宽度
	 * @param selected_cornerRadius_lefttop
	 * @param selected_cornerRadius_righttop
	 * @param selected_cornerRadius_rightbottom
	 * @param selected_cornerRadius_leftbottom
	 * @return
	 */
	public static Drawable getSelectedStateShapeResDrawable(Context context,
			int normal_strokecolor, int normal_fillcolor,
			int normal_strokeWidth, int normal_cornerRadius_lefttop,
			int normal_cornerRadius_righttop,
			int normal_cornerRadius_rightbottom,
			int normal_cornerRadius_leftbottom, int selected_strokecolor,
			int selected_fillcolor, int selected_strokeWidth,
			int selected_cornerRadius_lefttop, int selected_cornerRadius_righttop,
			int selected_cornerRadius_rightbottom,
			int selected_cornerRadius_leftbottom) {

		GradientDrawable normaldrawable = new GradientDrawable();// 创建drawable
		normaldrawable.setColor(  normal_fillcolor );
		normaldrawable.setCornerRadii(new float[] { normal_cornerRadius_lefttop, normal_cornerRadius_lefttop, normal_cornerRadius_righttop, normal_cornerRadius_righttop, normal_cornerRadius_rightbottom, normal_cornerRadius_rightbottom,
				normal_cornerRadius_leftbottom, normal_cornerRadius_leftbottom }); // 以此是左上角，右上角，右下角，左下角

		normaldrawable.setStroke(normal_strokeWidth,  normal_strokecolor );

		GradientDrawable selecteddrawable = new GradientDrawable();// 创建drawable
		selecteddrawable.setColor(  selected_fillcolor );
		selecteddrawable.setCornerRadii(new float[] { selected_cornerRadius_lefttop, selected_cornerRadius_lefttop, selected_cornerRadius_righttop,selected_cornerRadius_righttop, selected_cornerRadius_rightbottom,selected_cornerRadius_rightbottom,
				selected_cornerRadius_leftbottom,selected_cornerRadius_leftbottom }); // 以此是左上角，右上角，右下角，左下角
		selecteddrawable.setStroke(selected_strokeWidth,  selected_strokecolor);

		return getSelectedStateDrawable(normaldrawable, selecteddrawable);
	}
}
