/*
 * This file is part of "SnipSnap Radeox Rendering Engine".
 *
 * Copyright (c) 2002 Stephan J. Schmidt, Matthias L. Jugel
 * All Rights Reserved.
 *
 * Please visit http://radeox.org/ for updates and contact.
 *
 * --LICENSE NOTICE--
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
 * --LICENSE NOTICE--
 */

package org.radeox.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.radeox.api.engine.RenderEngine;
import org.radeox.api.engine.context.RenderContext;
import org.radeox.engine.BaseRenderEngine;
import org.radeox.engine.context.BaseRenderContext;

/*
 * Interactive example how to use EngineManager @author Stephan J. Schmidt
 * 
 * @version $Id: InteractiveExample.java 7707 2006-04-12 17:30:19Z
 *          ian@caret.cam.ac.uk $
 */

public class InteractiveExample
{
	public static void main(String[] args)
	{
		System.err.println("Radeox 0.8");
		System.err
				.println("Copyright (c) 2003 Stephan J. Schmidt, Matthias L. Jugel. "
						+ "\nAll Rights Reserved.");
		System.err
				.println("See License Agreement for terms and conditions of use.");

		RenderEngine engine = new BaseRenderEngine();

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		RenderContext context = new BaseRenderContext();
		String line;
		try
		{
			System.out.print("> ");
			System.out.flush();
			while ((line = reader.readLine()) != null)
			{
				System.out.println(engine.render(line, context));
				System.out.print("> ");
				System.out.flush();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
