/*
	Skype Bookmark is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	Skype Bookmark is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with Skype Bookmark. If not, see <http://www.gnu.org/licenses/>.

	Original Author: Síragon I&D <desarrollo03@siragon.com.ve>

	Developers: <Please add your email here>
	Contributors: <Please add your email here>
	Translators: <Please add your email here>
*/

package com.skype.bookmark;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent; 
import android.net.Uri;

public class MainActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tkqlhce.com/click-5137407-10576606?sid=AA&sid2=238"));
		startActivity(browserIntent);
		finish();
        System.exit(0);
    }
	private static final String BASE64_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgI9+LBSsWYVwdZ0uiCFyvj6pOZrpP6SYaF4Rp98qNLvtyNM2xmDjqgNK8jp17PkKNu55TYmOt4ZV7HH20Wda5ZrJtpMtHNeAGYvSroaPbKx2el0pFm6gdp9nlBW9ZwifsCmn5666fpWAtkHq+JZryGDXD0/tWX/jRBsaQOMyqYUKn/dZWT7sOE5Y5W1ZHSRiQWmq/s7pMeEEVRAiclKmUo18W9XmznYwghKIxA6vOnBUGQABZlEd0raumuUvIsx3rfVN0Z6eP4waXedFh0qmOEuuulNegtTsfCJIPnql+hjqBmHlpctAvLjM8axAstS6oAY8SIgsjN5DqlwFUOduwQIDAQAB";
}
