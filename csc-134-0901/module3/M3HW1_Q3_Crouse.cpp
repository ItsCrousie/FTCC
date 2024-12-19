#include <iostream>
#include <string>
#include <vector>

using namespace std;

/*
CSC-134-1901
M3HW1_Q3 - Finance Planner CYOA-esk
Gold
Brian Crouse
22SEP2024
*/

/*This is based on the flowchart: https://imgur.com/personal-income-spending-flowchart-united-states-lSoUQr2*/

//Current User Descision
  //Research Later: why tf does 'struct State' not work.
class State {
  public:
    string question;
    int yesIdx;
    int noIdx;
};

vector<string> basicChecklist {
  {"1. Create a Budget\n  (Fundamental to a sound financial footing is knowing where your money is going, budgeting helps you see your sources of income less your expenses.)"},
  {"2. Pay Rent/Mortgage\n    (Including renters or homeowners insurance if required.)"},
  {"3. Buy Food/Groceries\n    (Depending on the severity your situation and needs you may wish to prioritize utilites before this node.)"},
  {"4. Pay Essential Items\n    (Power, water, heat, toiletries, etc.)"},
  {"5. Pay Income Earning Expenese\n    (Necessary transportation expenses, possiby Internet/Phone, anything required to continue earning income)"},
  {"6. Pay Health Care\n    (Health insurance and health care expenses)"},
  {"7. Make Minimum Payments On All Debts & Loans\n    (Student Loans, Credit Cards, etc.)"},
  {"8. Build Small Emergency Fund\n    (Either $1,000 or one months' worth of expenses, whichever is greater; use a savings or checkings account)"},
  {"9. Pay Any Non-Essential Bills in Full\n    (Cable, Internet, Phone, etc.)"},
};

//The flowchart based on choice starting with the first y/n question.
vector<State> states = {
  {"Does your employer offer a retirement account with an employer match?", 1, 2}, //0
  {"Contribute the amount needed to get the full employer match, but nothing above that amount.", 2, 2}, //1
  {"Do you have any high interest debt (i.e., debt with an interest rate of 10% or higher)?", 3, 4}, //2
  {"Evaluate the merits of the 'Avalanche' and 'Snowball' methods and their advantages in your personal financial/psychological situation and apply accordingly to pay off these debts.", 2, 2}, //3
  {"Increase Emergency Fund to 3-6 Months Living Expenses.\n  (Use a savings or checking account.)", 5, 4}, //4
  {"Do you have any moderate interest debt (i.e., remaining debt over 4.5% interest rate, excluding mortgage)?", 6, 7}, //5
  {"Evaluate the merits of the 'Avalanche' and 'Snowball' methods and their advantages in your personal financial/psychological situation and apply accordingly to pay off these debts.", 5, 5}, //6
  {"Evaluate the merits of a Roth vs. Traditional IRA in the context of your personal financial situation and max the yearly contributions accordingly.", 8, 8}, //7
  {"Are you expecting any large, required purchases or personal investments in the near future?", 9, 10}, //8
  {"Save the amount needed for these expenses in a savings or checking account.", 10, 10}, //9
  {"Are you currently saving at least 15% of your pre-tax income for retirement?\n  (Total contributions to all retirement accounts; note that you may need to save more if you are behind on retirement savings.)", 14, 11}, //10
  {"Does your employer offer a 401(k), 403(b) or similar retirement plan into which you could save money?", 12, 13}, //11
  {"Increase contributions until you have reached 15% pre-tax income being saved for retirement.", 10, 10}, //12
  {"If self-employed, contribute to an individual 401(k), SEP-IRA, or SIMPLE IRA to reach 15% pre-tax income saved; If not self-employed, contribute to a taxable account to reach this goal", 10, 10}, //13
  {"Do you have a qualified high-deductible health plan and are thus eligible for an investable HSA?", 15, 16}, //14
  {"Max yearly HSA contributions", 16, 16}, //15
  {"Do you have children and wish to help pay for some or all of their college expenses?", 17, -1}, //16
  {"Evaluate available saving/investment options, such as a 529 plan, and contribute accordingly.", -1, -1}, //17
};

void printChecklist(vector<string> checklist) {
  for (string item : checklist) {
    cout << item << endl;
  }
}

void navigate(int currentState){
  while (currentState != -1) {
    const State& current = states[currentState];
    cout << current.question << "(yes/no): ";
    string input;
    cin >> input;

    if (input == "yes") {
      currentState = current.yesIdx;
    }
    else if (input == "no") {
      currentState = current.noIdx;
    }
    else {
      cout << "Invalid Input: Please answer either 'yes' or 'no'.\n";
    }
  }
  cout << "Please re-run the program.";
}

void endingChoice() {
  cout << "At this point you have some options on how to proceed, and it is completely up to you and your personal goals and desires." << endl;
  cout << "1 - Would you like to retire early?\n2 - Do you have more immediate goals?" << endl;
  int userChoice;
  cin >> userChoice;
  if (userChoice == 1) {
    cout << "Max out 401(k), 403(b), or other employer sponsored account, consider the \"mega backdoor Roth IRA\", then use a taxable account."<< endl;
  }
  else if (userChoice == 2) {
    cout << "Use savings for goals sooner than 3-5 years, a conservative mix of stocks and bonds for goals more than 3-5 years away.\n(Common examples include down payments for homes, savings for vehicles, paying down a mortgage, and vacation funds.)" << endl;
  }
  else {
    cout << "Please enter either '1' or '2' for the respective options.";
    cin >> userChoice;
  }

  cout << "Good luck in your financial endevours!" << endl;
}

int main()
{
  printChecklist(basicChecklist);
  navigate(0);
  endingChoice();
  return 0;
}
