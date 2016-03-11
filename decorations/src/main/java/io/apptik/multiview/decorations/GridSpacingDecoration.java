/*
 * Copyright (C) 2015 AppTik Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.apptik.multiview.decorations;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.util.AttributeSet;


public class GridSpacingDecoration extends ItemDecoration {
    public final static int DEFAULT_PADDING = 8;
    private int mPaddingPx = 8;
    private int mPaddingEdgesPx = 16;

    public GridSpacingDecoration(Context ctx) {
        final Resources resources = ctx.getResources();
        mPaddingPx = (int) resources.getDimension(io.apptik.multiview.decorations.R.dimen.paddingItemDecorationDefault);
        mPaddingEdgesPx = (int) resources.getDimension(io.apptik.multiview.decorations.R.dimen.paddingItemDecorationEdge);
    }
    public GridSpacingDecoration(int verticalSpacing, int horizontalSpacing) {
        mPaddingPx = verticalSpacing;
    }

    @Override
    public void getItemOffsets(Rect outRect, int itemPosition, RecyclerView parent) {

    }
}