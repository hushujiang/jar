package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p052o.C0638a;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class Dora extends Spider {

    /* renamed from: a */
    private Spider f16a;

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        return this.f16a.categoryContent(str, str2, z, hashMap);
    }

    public String detailContent(List<String> list) {
        return this.f16a.detailContent(list);
    }

    public String homeContent(boolean z) {
        return this.f16a.homeContent(z);
    }

    public String homeVideoContent() {
        return this.f16a.homeVideoContent();
    }

    public void init(Context context) {
        super.init(context);
    }

    public void init(Context context, String str) {
        String str2;
        try {
            String[] split = str.split(atm.m897d("49"));
            String str3 = "";
            if (split.length == 1) {
                str3 = split[0];
                str2 = "";
            } else if (split.length == 2) {
                str3 = split[0];
                str2 = split[1];
            } else {
                str2 = "";
            }
            Spider m160a = C0638a.m160a(str3);
            this.f16a = m160a;
            m160a.init(context, str2);
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        super.init(context, str);
    }

    public boolean isVideoFormat(String str) {
        return this.f16a.isVideoFormat(str);
    }

    public boolean manualVideoCheck() {
        return this.f16a.manualVideoCheck();
    }

    public String playerContent(String str, String str2, List<String> list) {
        return this.f16a.playerContent(str, str2, list);
    }

    public String searchContent(String str, boolean z) {
        return this.f16a.searchContent(str, z);
    }
}
